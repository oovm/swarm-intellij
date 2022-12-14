package swarm.intellij.ide.todo


import com.intellij.lexer.Lexer
import com.intellij.psi.impl.cache.impl.BaseFilterLexer
import com.intellij.psi.impl.cache.impl.OccurrenceConsumer
import com.intellij.psi.impl.cache.impl.todo.LexerBasedTodoIndexer
import com.intellij.psi.search.UsageSearchContext
import swarm.intellij.language.SwarmLexerAdapter
import swarm.intellij.language.SwarmParserDefinition


class TodoIndexer : LexerBasedTodoIndexer() {
    override fun createLexer(consumer: OccurrenceConsumer): Lexer {
        return object : BaseFilterLexer(SwarmLexerAdapter(), consumer) {
            override fun advance() {
                if (myDelegate.tokenType in SwarmParserDefinition.COMMENTS) {
                    scanWordsInToken(UsageSearchContext.IN_COMMENTS.toInt(), false, false)
                    advanceTodoItemCountsInToken()
                }
                myDelegate.advance()
            }
        }
    }
}

#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};


import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
class ApplicationTest implements WithAssertions {

    @Test
    void shouldWork() {
        LawnmowerApplication.main(new String[]{});
    }
}

package mx.iteso;

import static mx.iteso.Foo.*;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created by rtorres on 9/3/15.
 */
public class MockitoHelloWorldExampleTest {
    private Foo foo;

    @Before
    public void setUp() {
        foo = mock(Foo.class);
        when(foo.greet()).thenReturn(HELLO_WORLD);
    }
    @Test
    public void fooGreets() {
        System.out.println("Foo greets: " + foo.greet());
        assertEquals(foo.greet(), HELLO_WORLD);
    }

    @Test
    public void barGreets() {
        Bar bar = new Bar();
        assertEquals(HELLO_WORLD, bar.greet(foo));
    }

    @Test(expected=FooNotAvailable.class)
    public void fooNotAvailable() {
        Bar bar = new Bar();
        System.out.println("Foo is down so will not respond");
        when(foo.greet()).thenReturn(null);
        System.out.println("Bar sends a question to Foo but since Foo is not avilable will throw FooNotAvailable");
        bar.question(foo, "Hello Foo");
    }

    @Test
    public void barQuestionsFoo() {
        Bar bar = new Bar();
        System.out.println("Bar asks Foo 'Any new topics?', it should get " +
                "a response");
        bar.question(foo, Foo.ANY_NEW_TOPICS);
        System.out.println("Verify that Foo has been asked the question");
        verify(foo, times(1)).question(Foo.ANY_NEW_TOPICS);
    }

    @Test
    public void filterInvalidQuestions() {
        Bar bar = new Bar();
        String invalidQuestion = "Invalid question";
        bar.question(foo, invalidQuestion);
        System.out.println("Verify that question was never requested as Foo " +
                "is un-available");
        verify(foo, never()).question(invalidQuestion);
    }

    @Test(expected=InvalidQuestion.class)
    public void throwExceptionIfInvalidQuestion() throws InvalidQuestion {
        Bar bar = new Bar();
        String invalidQuestion = "Invalid question";
        when(foo.questionStrictly(invalidQuestion))
                .thenThrow(new InvalidQuestion());
        bar.questionStrictly(foo, invalidQuestion);
    }

}

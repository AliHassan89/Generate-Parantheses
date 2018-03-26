package test.java;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.List;
import main.java.GenerateParantheses;
import org.junit.Test;

public class GenerateParanthesesTest {

  GenerateParantheses gp = new GenerateParantheses();

  @Test
  public void generateParenthesis_checkForZero(){
    //given
    int n = 0;

    //when
    List<String> results = gp.generateParenthesis(n);

    //then
    List<String> braces = new ArrayList<>();
    assertThat(results, equalTo(braces));
  }

  @Test
  public void generateParenthesis_checkForNgreaterThan0(){
    //given
    int n = 3;

    //when
    List<String> results = gp.generateParenthesis(n);

    //then
    List<String> braces = new ArrayList<>();
    braces.add("((()))");
    braces.add("(()())");
    braces.add("(())()");
    braces.add("()(())");
    braces.add("()()()");

    assertThat(results, equalTo(braces));
  }

}

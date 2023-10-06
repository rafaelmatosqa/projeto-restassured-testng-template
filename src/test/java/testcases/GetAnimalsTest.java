package testcases;

import apis.Apis;
import org.testng.annotations.Test;

public class GetAnimalsTest {

    @Test
    public void test_GetAnimals(){

        Apis.apis.consultarAnimals();
    }
}

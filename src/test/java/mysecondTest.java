import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class mysecondTest extends ChromeRunner {
    @Test
    public void autotestthird(){
        $(byText("დახურვა")).click();
        $(byClassName("btn-cart")).click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        $("#search_list").setValue("ლეპტოპი").pressEnter();
        $(byClassName("add_to_cart"), 0).click();
        $(byClassName("btn-cart")).click();
        $(byClassName("btn-cart")).shouldNotBe(Condition.empty);
        $(byText("წაშლა")).click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);

        sleep(5000);

    }
    @Test

    public void autotestfour(){
        open("https://ee.ge/registration");
        $(byText("დახურვა")).click();
        $(byClassName("btn-cart")).click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        $(byClassName("fa-heart-o")).click();
        $(byText("ვერ მოიძებნა")).shouldBe(Condition.visible);
        $("#search_list").setValue("ლეპტოპი").pressEnter();
        $(byClassName("add_to_cart"), 0).click();
        $(byClassName("btn-cart")).click();
        $(byClassName("redButton"), 0).click();
        $(byClassName("fa-heart-o")).click();
        $(byText("ვერ მოიძებნა")).shouldNotBe(Condition.visible);
        $(byClassName("btn-cart")).click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        $(byClassName("fa-heart-o")).click();
        $(byClassName("d-xs-none")).click();
        $(byText("ვერ მოიძებნა")).shouldNotBe(Condition.visible);


        sleep(6000);


    }
}

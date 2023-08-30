import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;


import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.*;

public class myfirstTest extends ChromeRunner {
    @Test

    public void autotest(){
        SelenideElement ee = $(".loginsection-two");
        $("#firstName").setValue("მარიამი");
        $("#firstName").shouldNotBe(Condition.empty);
        $("#lastName").setValue("ჩაჩანიძე");
        $("#lastName").shouldNotBe(Condition.empty);
        $("#email").setValue("m.chachanidze2311@gmail.com");
        $("#email").shouldNotBe(Condition.empty);
        $("#password").setValue("mariami");
        $("#confirmPassword").setValue("mariami");
        $("#singup").shouldBe(Condition.enabled);

        sleep(5000);


    }
    @Test

    public void autotestsecond(){
        SelenideElement ee = $(".loginsection-two");
        $(byText("დახურვა")).click();
        $("#singup").shouldBe(Condition.disabled);
        $("#firstName").click();
        $("#lastName").click();
        $("#email").click();
        $("#password").click();
        $("#confirmPassword").click();
        $(byText("სახელი სავალდებულოა"));
        $(byText("გვარი სავალდებულოა"));
        $(byText("ელ. ფოსტა სავალდებულოა"));
        $(byText("პაროლი სავალდებულოა."));
        $(byText("პაროლის გამეორება სავალდებულოა"));
        $("#email").setValue("m.chachanidze2311mail.com");
        $(byText("ელ. ფოსტა სავალდებულოა")).shouldNotBe(Condition.disappear);
        $("#password").setValue("maria");
        $(byText("პაროლი სავალდებულოა.")).shouldNotBe(Condition.disappear);

        sleep(3000);


    }






}

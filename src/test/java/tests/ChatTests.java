package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ChatTests extends BaseTest {

//    public static void main(String[] args) {
//        String myfile = String.format("%ssrc%smain%sresources%smy_file.pdf", File.separator, File.separator, File.separator, File.separator);
//        форматирование слэшей
//    }

    protected WebDriver driver;
    String message = " ";

    @Test(invocationCount = 5)
    // запуск теста 5 раз
    public void sendMessage() {
        //OPEN PAGE
        //FIND TEXT AREA AND INPUT TEXT
        //FIND BUTTON AND CLICK
        //VALIDATE THAT MESSAGE EXIST
        chatPage.openPage();
        chatPage.writeText("Text");
        chatPage.clickSend();
        chatPage.messageShouldExist(1, "Text");
    }

    @Test
    public void DownWithCheck() {
        chatPage.openPage();
        chatPage.ClickInvitePush();
        chatPage.verifyBufferLink();
    }

    @Test
    public void SendMessageEnter() {
        chatPage.openPage();
        chatPage.sendMessageEnter("AutoTest");
        chatPage.verifyMessage("AutoTest");
    }

    @Test
    public void fileUpload() {
        chatPage.openPage();
        chatPage.fileUpload("/src/main/resources/my_file.pdf");
        chatPage.verifyFile("my_file.pdf (0kb)");
    }

    @Test
    public void sendMessageButton() {
        chatPage.openPage();
        chatPage.sendMessageButton("AutoTest");
        chatPage.verifyMessage("AutoTest");
    }

    @Test
    public void sendOneThousand() {
        String oneThousand = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi imperdiet quam ac erat dapibus volutpat. Suspendisse at laoreet arcu. Pellentesque et sem facilisis, auctor ante nec, imperdiet lacus. Interdum et malesuada fames ac ante ipsum primis in faucibus. Etiam purus enim, suscipit at commodo eu, laoreet sit amet orci. Curabitur quis fermentum urna, sed vulputate urna. Suspendisse non justo vestibulum, fermentum elit ut, mollis nulla. Mauris finibus eu justo nec suscipit.\n" +
                "\n" +
                "Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Fusce laoreet enim quis posuere feugiat. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent vehicula luctus urna, ac feugiat odio iaculis at. Maecenas tempus dapibus dui quis condimentum. Ut blandit lacus neque, eget mollis sem sodales vel. Aliquam viverra, mauris at porttitor volutpat, felis dui porttitor diam, non hendrerit sem sapien sed tellus. Duis diam velit, rutrum eu nisi nec, accumsan viverra metus.";
        chatPage.openPage();
        chatPage.sendMessageButton(oneThousand);
        chatPage.verifyMessage(oneThousand);
    }

//    @Test
//    public void sendLink() {
//        String link = "https://dev.integrivideo.com/";
//        chatPage.openPage();
//        chatPage.sendMessageButton(link);
//        chatPage.verifyMessage(link);
//    }

    @Test
    public void sendCode() {
        String code = "<html><body><h><test</h></body></html>";
        chatPage.openPage();
        chatPage.sendMessageButton(code);
        chatPage.verifyMessage(code);
    }

    @Test
    public void editMessage() {
        String updatedMessage = "Updated";
        chatPage.openPage();
        chatPage.sendMessageButton(message);
        chatPage.editMessage(message, updatedMessage);
        WebDriverWait wait = new WebDriverWait(driver, 20);
        chatPage.verifyMessage(updatedMessage + message);
    }

    @Test
    public void editMessageRemove() {
        chatPage.openPage();
        chatPage.sendMessageButton(message);
        chatPage.editMessageRemove(message);
        chatPage.verifyErrorMessage("Сообщение не может быть пустым");
    }
}


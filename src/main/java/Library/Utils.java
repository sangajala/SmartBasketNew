package Library;

import org.openqa.selenium.WebDriver;


    /**
     * Created by SRI on 15-Jul-14.
     */

 public class Utils {
        public Utils(WebDriver driver) {

        }
        public static void pause(int time) {
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

}

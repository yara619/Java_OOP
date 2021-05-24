Author: Mehmood Yar Baig

Investigate the capabilities of JavaFX’s WebView control and WebEngine class, then create a JavaFX app that provides basic web browsing capabilities.

**Download the JavaFX SDK:**
https://gluonhq.com/products/javafx/

**Add JavaFX library:**
File -> Project Structure -> Libraries -> add library
path->C:\javafx-sdk-11.0.2\lib

**Add VM Options:**
Run-> Edit Configuration -> modify options -> add vm options
--module-path %PATH_TO_JAVAFX_SDK/LIB% --add-modules=javafx.swing,javafx.graphics,javafx.fxml,javafx.media,javafx.web --add-reads javafx.graphics=ALL-UNNAMED --add-opens javafx.controls/com.sun.javafx.charts=ALL-UNNAMED --add-opens javafx.graphics/com.sun.javafx.iio=ALL-UNNAMED --add-opens javafx.graphics/com.sun.javafx.iio.common=ALL-UNNAMED --add-opens javafx.graphics/com.sun.javafx.css=ALL-UNNAMED --add-opens javafx.base/com.sun.javafx.runtime=ALL-UNNAMED

**Screenshots**
![image](https://user-images.githubusercontent.com/48985550/119397291-ba17d480-bcf7-11eb-95e2-1ccc3e2ab82f.png)

![image](https://user-images.githubusercontent.com/48985550/119397458-f3504480-bcf7-11eb-8fd6-780e3c1c8d8a.png)


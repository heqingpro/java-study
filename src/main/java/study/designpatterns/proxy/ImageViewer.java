package study.designpatterns.proxy;

import java.net.URL;

/**
 * @author heqingqing
 * @Description: $
 * @date 2019/7/7 21:47
 */
public class ImageViewer {

    public static void main(String[] args) throws Exception {
        String image = "https://pics1.baidu.com/feed/f11f3a292df5e0fe5e1f216341b423ad5fdf72a2.jpeg?token=c8b351ca1d4f45fa7d5b12aced8de92d&s=F41736D410EB2B0FEE327800030070DA";
        URL url = new URL(image);
        HighResolutionImage highResolutionImage = new HighResolutionImage(url);
        ImageProxy imageProxy = new ImageProxy(highResolutionImage);
        imageProxy.showImage();
    }
}

package in.techcamp.firstapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //アノテーション Springにそのクラスがコントローラーであることを伝えるためのもの。
public class PostController {
    @GetMapping("/hello") //アノテーション　railsのルーティング的な役割。ルートパス/helloというパスに行ったら下記メソッドを実行する。GetはHTTPメソッドのこと、そのためPostMappingもある。
    public String showHello(){
        return "hello"; //この記述でresourcesフォルダに作成したhello.htmlを読み込める。
    }
}

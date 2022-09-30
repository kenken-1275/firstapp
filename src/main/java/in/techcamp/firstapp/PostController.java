package in.techcamp.firstapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //アノテーション Springにそのクラスがコントローラーであることを伝えるためのもの。
public class PostController {
    @GetMapping("/hello") //アノテーション　railsのルーティング的な役割。ルートパス/helloというパスに行ったら下記メソッドを実行する。GetはHTTPメソッドのこと、そのためPostMappingもある。
    @ResponseBody //アノテーション　リクエストに対して、HTMLを返すためのもの。下記メソッドでreturnされる文字列を、HTMLと解釈させるためのもの。
    public String showHello(){
        return "<h1>Hello World!</h1>";
    }
}

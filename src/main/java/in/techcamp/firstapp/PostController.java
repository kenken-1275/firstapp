package in.techcamp.firstapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller //アノテーション Springにそのクラスがコントローラーであることを伝えるためのもの。
public class PostController {
    @GetMapping("/hello") //アノテーション　railsのルーティング的な役割。ルートパス/helloというパスに行ったら下記メソッドを実行する。GetはHTTPメソッドのこと、そのためPostMappingもある。
    public String showHello(Model model) { //Model型のオブジェクトを用意して、データを追加してビューに渡す。
        var sampleText = "サンプルテキスト"; //変数を定義
        model.addAttribute("sampleText", sampleText); //addAttributeでmodelに要素を追加している。1つ目の引数がビューで読み込む際の名称、2つ目の引数が直前の変数を表している。
        return "hello"; //この記述でresourcesフォルダのtemplatesフォルダに作成したhello.htmlを読み込める。
    }
    @GetMapping  //@GetMapping("/")と同じ意味。ルートパスの時は省略できる。
    public String showList(Model model){
        var postList = List.of( //この記述で、3件のデータを作成している。List.ofは文字通りリストを作成するメソッド。
                new PostEntity(1,"投稿1"), //PostEntityクラスのオブジェクトを3つ作成している。
                new PostEntity(1,"投稿2"),
                new PostEntity(1,"投稿3")
        );
        model.addAttribute("postList",postList);//作成したオブジェクトをmodelに追加している。
        return "index";
    }
}

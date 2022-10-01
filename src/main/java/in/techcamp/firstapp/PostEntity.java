package in.techcamp.firstapp;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor //lombokの@AllArgsConstructorはコンストラクタを自動で生成してくれるアノテーション。
@Data //lombokの@Dataは、ゲッターとセッターを自動で設定してくれるアノテーション。
public class PostEntity {//idとmemoカラムに対応するようエンティティを作成する。
    private long id;
    private String memo;
}

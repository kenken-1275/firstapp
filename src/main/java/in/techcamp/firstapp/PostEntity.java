package in.techcamp.firstapp;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PostEntity {//idとmemoカラムに対応するようエンティティを作成する。
    private long id;
    private String memo;

    public long getId() {//ゲッターとセッターの設定。これもcommand+nから作成できる。
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}

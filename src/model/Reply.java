package model;

/**
 * Created by kale on 2017/9/21.
 */
public class Reply {
    //0: 成功其他: 错误代码
    private String result;
    //错误描述
    private String errorDescription;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }
}

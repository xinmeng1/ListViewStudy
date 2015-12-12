package tk.mengxin.listviewstudy;

/**
 * Created by Android Studio.
 * User: Xin Meng
 * Date: 12/12/2015
 * Time: 10:51
 * Version: V 1.0
 */

public class Signature {

    private String id;
    private String signatureName;
    private String initialName;
    private String type;

    public Signature(String id, String initialName, String signatureName, String type) {
        this.id = id;
        this.initialName = initialName;
        this.signatureName = signatureName;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInitialName() {
        return initialName;
    }

    public void setInitialName(String initialName) {
        this.initialName = initialName;
    }

    public String getSignatureName() {
        return signatureName;
    }

    public void setSignatureName(String signatureName) {
        this.signatureName = signatureName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

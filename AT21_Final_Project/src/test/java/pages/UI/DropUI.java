package pages.UI;

public class DropUI {
    public static String simpleTab = "droppableExample-tab-simple";
    public static String dragbox = "draggable";
    public static String dropbox = "droppable";

    public static String acceptTab = "droppableExample-tab-accept";
    public static String acceptableBox = "acceptable";
    public static String notAcceptableBox = "notAcceptable";
    public static String dropboxAccept = "//div[@id='acceptDropContainer']//div[@id='droppable']";

    public static String preventTab = "droppableExample-tab-preventPropogation";
    public static String dragBox = "dragBox";
    public static String textDropBoxOuter1 = "//div[@id='notGreedyInnerDropBox']//preceding::p[1]";
    public static String dropBoxNotGreedyInner = "notGreedyInnerDropBox";
    public static String textDropBoxOuter2 = "//div[@id='greedyDropBoxInner']//preceding::p[1]";
    public static String dropBoxGreedyInner = "greedyDropBoxInner";

    public static String revertTab = "droppableExample-tab-revertable";
    public static String revertableBox = "revertable";
    public static String notRevertableBox = "notRevertable";
    public static String dropboxRevert = "//div[@id='revertableDropContainer']//div[@id='droppable']";

}

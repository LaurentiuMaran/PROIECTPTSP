public class Chapter {

    private String chapterName;


    public Chapter(String chapterName){
        this.chapterName=chapterName;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void print(){
        System.out.println("Chapter name: "+this.getChapterName());
    }
}

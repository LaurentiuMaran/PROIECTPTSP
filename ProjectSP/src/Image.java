public class Image extends Element{

    private String imageName;

    public Image(String imageName){
        this.imageName=imageName;
    }

    public String getImageName() {
        return imageName;
    }

    public void print() {
        System.out.println("Image with name: "+this.getImageName());
    }
}

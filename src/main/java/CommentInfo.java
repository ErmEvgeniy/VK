public class CommentInfo {
    private int id;
    private String title = "";
    private String description = "";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

   public void setTitle(String t){
       title = t;
   }

   public String getTitle(){
       return title;
   }
}

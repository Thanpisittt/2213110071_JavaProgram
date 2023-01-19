
public class VideoStoreLauncher {

	public static void main(String[] args) {
		Videos vid1 = new Videos();
		vid1.setTitle("GodFather");
		
        vid1.addRating(3);
        vid1.addRating(2);
        vid1.addRating(5);
        vid1.getRating();
        
        System.out.println(vid1.getTitle()+":"+vid1.getRating());
        
        vid1.checkOut();
        getStatus(vid1);
        vid1.returnToStore();
        getStatus(vid1);
	}//end main
	 public static void getStatus(Videos v)
	 {
		 if(v.isCheckedOut())
		 {
			 System.out.println("\'"+v.getTitle()+"\' is checked out.");
			 
		 }
		 else 
		 {
			 System.out.println("\'"+v.getTitle()+"\' is on the shelves.");
		 }
	 }

}

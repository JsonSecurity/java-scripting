import java.util.List;

public class main{
	public static void ejem11(){
		var bottles = List.of("glass", "plastic", "can");
		for (int type = 1; type < bottles.size();) {
			System.out.print(bottles.get(type) + "-");
		 	if(type < bottles.size())
		 		break;
		}
		System.out.print("end");
	}
	public static void main(String []args){
		main.ejem11();
	}
}

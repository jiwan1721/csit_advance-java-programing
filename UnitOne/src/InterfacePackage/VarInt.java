package InterfacePackage;


class VarInt1 {
	int var = 88;
	

}
interface VarInt2 extends VarInt1 {
	
}
public class VarInt implements VarInt1, VarInt2 {
	public static void main(String[] args) {
		System.out.println(var);
	}
}

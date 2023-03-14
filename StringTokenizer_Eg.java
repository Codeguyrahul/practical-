package String;
import java.util.StringTokenizer;
public class StringTokenizer_Eg {
	public static void my() {
		StringTokenizer t = new StringTokenizer("Anudip foundation skill and carrer development center");
	while(t.hasMoreTokens()) {
		System.out.println(t.nextToken(" "));
	}
	StringTokenizer st = new StringTokenizer("Anudip & rahul learn & java full stack development");
	while(st.hasMoreTokens()) {
		System.out.println(st.nextToken(" &"));
	
	}}
public static void main(String[] args) {
	my();
}
}

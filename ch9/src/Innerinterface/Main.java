package Innerinterface;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button b = new Button();

		Call c = new Call();
		b.SetOnClickListener(c);
//		b.SetOnClickListener(c);
		b.SetOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick() {
				System.out.println("Make a call");
			}
		});
		b.touch();

		Message m = new Message();
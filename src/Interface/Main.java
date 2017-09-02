package Interface;

public class Main {
	public static void main(String[] args) {
		ITelephone timsPhone = new ITelephone() {
			
			@Override
			public void powerOn() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean isRinging() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void dial(int phoneNumber) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean callPhone(int phoneNumber) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void answer() {
				// TODO Auto-generated method stub
				
			}
		};
	}
}

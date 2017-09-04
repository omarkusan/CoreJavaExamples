package InnerClass;

public class Button {
	private String title;
	private OnClickListener onClickListener;

	public Button(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
	public void setOnClickListener(OnClickListener onlickListener){
		this.onClickListener = onlickListener;
	}
	public void onClick(){
		this.onClickListener.onClick(this.title);
	}
	public interface OnClickListener{
		public void onClick(String title);
	}
	
}

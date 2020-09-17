public class CscExample
{
	private int questionNo;
	private String categary;
	private String text;
	
	public void setQuestionNO(int que)
	{
	}
	
	public void setCategary(String cate)
	{
	}
	
	public void setText(String text)
	{
	}
	
	public int getQuestionNO()
	{
	}
	
	public String getCategary()
	{ 
	}
	
	public String getText()
	{
	}
	
	public void addQuestion(CscExample que)
	{
		this.questionNo = que.getQuestionNO();
		this.categary = que.getCategary();
		this.text = que.getText();
		//System.out.println("addQuestion");
	}
	
	public void removeQuestion(int quId)
	{
		System.out.println("removeQuestion");
	}
	
	public void editQuestion(int quId)
	{
		System.out.println("editQuestion");
	}
}
public class CscExample
{
	private int questionNo;
	private String categary;
	private String text;
	
	public void setQuestionNO(int que)
	{
		this.questionNo = que;
	}
	
	public void setCategary(String cate)
	{
		this.categary = cate;
	}
	
	public void setText(String text)
	{
		this.text = text;
	}
	
	public int getQuestionNO()
	{
		return questionNo;
	}
	
	public String getCategary()
	{ 
		return categary;
	}
	
	public String getText()
	{
		return text;
	}
	
	public void addQuestion(CscExample que)
	{
		System.out.println("addQuestion");
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
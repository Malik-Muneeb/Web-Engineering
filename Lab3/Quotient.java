public class Quotient
{
	public float calcQuotient(float num1, float num2)
	{
		if(num2==0)
		{
			throw new ArithmeticException("Divided by zero");
		}
		else
		{
			return num1/num2;
		}
	}
}
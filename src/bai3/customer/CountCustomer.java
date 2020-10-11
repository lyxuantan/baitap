package bai3.customer;

public class CountCustomer {
	private int n;

    public int getN()
    {
        return n;
    }

    public void setN(int n)
    {
        this.n = n;
    }

    public CountCustomer()
    {
        this(0);
    }

   

	public CountCustomer(int n)
    {
        this.n = n;
    }
}

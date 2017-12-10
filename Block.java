public abstract class Block
{

    public Block(char letter, int color)
    {
        int ascii = letter;
        if ((ascii >= 65) && (ascii <= 90)) this.letter = letter;
        if ((color >= 0) && (color <= 16777215)) this.color = color;
    }
    public char getLetter()
    {
        return letter;
    }

    public int getColor()
    {
        return color;
    }

    protected char letter;
    protected int color;

}


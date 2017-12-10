public class EditableTextBlock extends Block {
    public EditableTextBlock(char letter, int color)
    {
        super(letter, color);
    }

    public void setLetter(char l)
    {
        super.letter = l;
    }
    
    public void setColor(int c)
    {
        super.color = c;
    }
}


public class ShortWordFilter implements Filter {
    private String wholeWord;

    public String getWholeWord() {
        return wholeWord;
    }

    public void setWholeWord(String wholeWord) {
        this.wholeWord = wholeWord;
    }

    @Override
    public boolean accept(Object x) {
        wholeWord = String.valueOf(x);
        if(wholeWord.length() < 5) {
            return true;
        }else{
            return false;
        }
    }

}

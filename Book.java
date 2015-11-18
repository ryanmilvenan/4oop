class Book extends Media
{
    private String author;
    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
    }
	public String getAuthor() { return author; }
    public String toString()
    {
        return getTitle() + " by " + getAuthor();
	}
    
    public int compareTo(Media other) {
    	//Comparing to another book
    	if(other instanceof Book) {
    		//Use titles as the primary method of comparison
    		int titleComparison = this.title.compareTo(other.title);
    		//...fallback on author if the title is the same
    		if(titleComparison == 0) {
    			return this.author.compareTo(((Book)other).author);
    		} else {
    			return titleComparison;
    		}
    	} 
    	//Comparing to a DVD
    	else if(other instanceof DVD){
    		return 1;
    	} else {
    		//Compare titles for yet-to-be defined forms of media 
    		return this.title.compareTo(other.title);
    	}
    }
}


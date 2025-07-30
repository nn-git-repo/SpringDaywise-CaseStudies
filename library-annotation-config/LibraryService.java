package com.example.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class LibraryService {
	  @Autowired
	    private Book book;

	    @Autowired
	    private Member member;

	    @Autowired
	    private Loan loan;

	    public void manageLibrary() {
	        member.registerMember();
	        member.viewMembers();

	        book.addBook();
	        book.searchBook();

	        loan.issueBook();
	        loan.returnBook();
	    }
}

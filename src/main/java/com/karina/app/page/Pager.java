package com.karina.app.page;



import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Pager {
	
	private String kind;
	//검색어를 받을 변수
	private String search;
	//한 페이지에 보여줄 글의 갯수
	private Long perPage;
	//페이지번호
	private Long page;
	//ROWNUM 시작번호
	private Long first;
	//ROWNUM 끝번호
	private Long last;
	//jsp에 출력할 블럭 시작번호
	private Long start;
	//jsp에 출력할 블럭 끝번호
	private Long end;
	//이전블록 유무
	private boolean pre;
	//다음블록 유무
	private boolean next;
	
	public String getSearch() {
		if(this.search==null) {
			this.search="";
		}
		
		return this.search;
	}
	
	public Long getPerPage(){
		if(this.perPage==null || this.perPage%5!=0) {
			this.perPage=10L;
		}
		
		return this.perPage;
	}
	
	public Long getPage() {
		if(this.page==null||this.page<1) {
			this.page=1L;
		}
		return this.page;
	}
	//------------------------------
	public void makerRowNumber()throws Exception{
		 this.first=(this.getPage()-1)*this.getPerPage()+1;
		 this.last=this.getPage()*this.getPerPage();
	}
	
	
	//-------------------------------
	
	public void makePageNumber(Long totalCount)throws Exception{
		
		//총 페이지 구하기
//		 Long totalPage=totalCount/this.getPerPage();
//		 if(totalCount%this.perPage !=0) {
//			 totalPage++;
//		 }
		
		Long totalPage=(long)(Math.ceil(totalCount/(double)this.getPerPage()));
		 if(this.getPage()>totalPage) {
			 this.page=totalPage;
		 }
		 

		 //한번에 몇개블럭을 보여줄지 정하고 총페이지수를이용해 전체블럭수를 구함
		 Long perBlock=5L;
		 Long totalBlock=totalPage/perBlock;
		 if(totalPage%perBlock!=0) {
			 totalBlock++;
		 }
		 
		 //현재 페이지가 몇번쨰 블럭인지 구하기
		 Long curBlock=this.getPage()/perBlock;
		 if(this.getPage()%perBlock!=0) {
			 curBlock++;
		 }

		 //현재페이지 기준으로 몇번째 블럭이 표시되어야하는지 구하기
		 this.start=(curBlock-1)*perBlock+1;
		 this.end=curBlock*perBlock;
		 
		 //이전블록이 존재한다면 true 아니면 false
		 if(curBlock>1) {
			 this.pre=true;
		 }
		 
		 //다음블록이 존재한다면 true 아니면 false
		 
		 if(curBlock<totalBlock) {
			 this.next=true;
		 }else {
			 this.setEnd(totalPage);
		 }
		 this.makerRowNumber();
	}
}

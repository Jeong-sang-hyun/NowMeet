/*
* Naonsoft Inc., Software License, Version 1.0
*
* Copyright (c) 2015 Naonsoft Inc.,
* All rights reserved.
*
* DON'T COPY OR REDISTRIBUTE THIS SOURCE CODE WITHOUT PERMISSION.
* THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
* WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
* OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
* DISCLAIMED. IN NO EVENT SHALL <<Naonsoft Inc.>> OR ITS
* CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
* SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
* LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
* USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
* ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
* OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
* OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
* SUCH DAMAGE.
*
* For more information on this product, please see
* <<www.naonsoft.com>>
*/
package com.nowMeet.main.bean;

/**
 * 게시글 정보를 담는 빈 Class입니다.
 */
public class BoardBean {
	/** 게시판 코드 */
	private String boardId;

	/** 제목 */
	private String title;

	/** 장소 */
	private String place;

	/** 모임일자 */
	private String meetDt;

	/** 모임시간 */
	private String meetTime;

	/** 인원 */
	private String numPeople;

	/** 인원구성 */
	private String peoplePosition;

	/** 인원(남성) */
	private String peoplePositionMale;

	/** 인원(여성) */
	private String peoplePositionFemale;

	/** 등록자번호 */
	private String userId;

	/** 삭제여부 */
	private String delYn;

	/** 등록일자 */
	private String regDt;

	/** 수정일자 */
	private String updDt;

	public String getBoardId() {
		return boardId;
	}

	public void setBoardId(String boardId) {
		this.boardId = boardId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getMeetDt() {
		return meetDt;
	}

	public void setMeetDt(String meetDt) {
		this.meetDt = meetDt;
	}

	public String getMeetTime() {
		return meetTime;
	}

	public void setMeetTime(String meetTime) {
		this.meetTime = meetTime;
	}

	public String getNumPeople() {
		return numPeople;
	}

	public void setNumPeople(String numPeople) {
		this.numPeople = numPeople;
	}

	public String getPeoplePosition() {
		return peoplePosition;
	}

	public void setPeoplePosition(String peoplePosition) {
		this.peoplePosition = peoplePosition;
	}

	public String getPeoplePositionMale() {
		return peoplePositionMale;
	}

	public void setPeoplePositionMale(String peoplePositionMale) {
		this.peoplePositionMale = peoplePositionMale;
	}

	public String getPeoplePositionFemale() {
		return peoplePositionFemale;
	}

	public void setPeoplePositionFemale(String peoplePositionFemale) {
		this.peoplePositionFemale = peoplePositionFemale;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getDelYn() {
		return delYn;
	}

	public void setDelYn(String delYn) {
		this.delYn = delYn;
	}

	public String getRegDt() {
		return regDt;
	}

	public void setRegDt(String regDt) {
		this.regDt = regDt;
	}

	public String getUpdDt() {
		return updDt;
	}

	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}
}
package shipx.entity;
// Generated May 11, 2015 8:38:29 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * ProyardMessages generated by hbm2java
 */
public class ProyardMessages  implements java.io.Serializable {


     private Long messageId;
     private Date timeStamp;
     private String messageType;
     private long sequenceNo;
     private String message;
     private String crc;
     private String processStatus;
     private String source;

    public ProyardMessages() {
    }

	
    public ProyardMessages(Date timeStamp, String messageType, long sequenceNo, String message) {
        this.timeStamp = timeStamp;
        this.messageType = messageType;
        this.sequenceNo = sequenceNo;
        this.message = message;
    }
    public ProyardMessages(Date timeStamp, String messageType, long sequenceNo, String message, String crc, String processStatus, String source) {
       this.timeStamp = timeStamp;
       this.messageType = messageType;
       this.sequenceNo = sequenceNo;
       this.message = message;
       this.crc = crc;
       this.processStatus = processStatus;
       this.source = source;
    }
   
    public Long getMessageId() {
        return this.messageId;
    }
    
    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }
    public Date getTimeStamp() {
        return this.timeStamp;
    }
    
    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }
    public String getMessageType() {
        return this.messageType;
    }
    
    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }
    public long getSequenceNo() {
        return this.sequenceNo;
    }
    
    public void setSequenceNo(long sequenceNo) {
        this.sequenceNo = sequenceNo;
    }
    public String getMessage() {
        return this.message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    public String getCrc() {
        return this.crc;
    }
    
    public void setCrc(String crc) {
        this.crc = crc;
    }
    public String getProcessStatus() {
        return this.processStatus;
    }
    
    public void setProcessStatus(String processStatus) {
        this.processStatus = processStatus;
    }
    public String getSource() {
        return this.source;
    }
    
    public void setSource(String source) {
        this.source = source;
    }




}



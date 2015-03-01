/**
 * 
 */
package jazmin.server.msg;

import java.util.HashMap;
import java.util.Map;

import jazmin.server.msg.codec.RequestMessage;
import jazmin.server.msg.codec.ResponseMessage;

/**
 * @author yama
 * 26 Dec, 2014
 */
public class Context {
	private boolean isFlush;
	private boolean isDisableResponse;
	private boolean isContinuation;
	private Session session;
	private Map<String,Object>responseMap;
	private RequestMessage requestMessage;
	private MessageServer messageServer;
	//
	Context(MessageServer messageServer,
			Session session,
			RequestMessage requestMessage,
			boolean isDisableResponse,
			boolean isContinuation){
		this.messageServer=messageServer;
		this.session=session;
		this.requestMessage=requestMessage;
		this.isDisableResponse=isDisableResponse;
		this.isContinuation=isContinuation;
		isFlush=false;
		responseMap=new HashMap<String, Object>(4);
	}
	//--------------------------------------------------------------------------
	//public interface
	/**
	 * get service id
	 */
	public String serviceId(){
		return requestMessage.serviceId;
	}
	/**
	 * return message server
	 */
	public MessageServer server(){
		return messageServer;
	}
	/**
	 * return session of this context.
	 */
	public Session session(){
		return session;
	}
	/**
	 * put object to client side.
	 */
	public void put(String key,Object v){
		responseMap.put(key, v);
	}
	/**
	 * flush context.
	 */
	public void flush(){
		if(isFlush){
			throw new IllegalStateException("context already flushed");
		}
		isFlush=true;
		if(!isDisableResponse){
			//write response
			ResponseMessage rspMessage=new ResponseMessage();
			rspMessage.requestId=requestMessage.requestId;
			rspMessage.responseMessages=responseMap;
			rspMessage.serviceId=requestMessage.serviceId;
			session.sendMessage(rspMessage);
		}
	}
	//--------------------------------------------------------------------------
	//private method
	//
	Boolean  getBoolean(int idx){
		String ss=requestMessage.requestParameters[idx];
		return ss==null?null:Boolean.valueOf(ss);
	}
	String  getString(int idx){	
		String ss=requestMessage.requestParameters[idx];
		return ss;
	}
	Long  getLong(int idx){
		String ss=requestMessage.requestParameters[idx];
		return ss==null?null:Long.valueOf(ss);
	}
	Integer  getInteger(int idx){
		String ss=requestMessage.requestParameters[idx];
		return ss==null?null:Integer.valueOf(ss);
	}
	Short  getShort(int idx){
		String ss=requestMessage.requestParameters[idx];
		return ss==null?null:Short.valueOf(ss);
	}
	Float  getFloat(int idx){
		String ss=requestMessage.requestParameters[idx];
		return ss==null?null:Float.valueOf(ss);
	}
	Double  getDouble(int idx){
		String ss=requestMessage.requestParameters[idx];
		return ss==null?null:Double.valueOf(ss);
	}
	//
	void close(){
		if(!isContinuation){
			flush();
		}
	}
}
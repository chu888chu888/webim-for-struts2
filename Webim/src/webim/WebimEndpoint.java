/*
 * WebimEndpoint.java
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package webim;

/**
 * ·�ɶ˵�(�û�)����ʱ��Ϣ·�ɶ˵㣬��ʶһ���û����ÿ͡�����
 * 
 * @author Ery Lee <ery.lee at gmail.com>
 * @since 1.0
 */
public class WebimEndpoint {

	/**
	 * �˵��ʶ�����ݸ���Ϣ������ʱ����Ϊname(��ʷԭ��)
	 */
	private String id;

	/**
	 *�˵�(�û�)�ǳ�
	 */
	private String nick;
	
	/**
	 * �ֳ�
	 */
	private String show = "unavailable";
	
	/**
	 * ״̬�������ʱ��
	 */
	private String status_time = "";
	
	/**
	 * �˵�(�û�)��ҳ
	 */
	private String url = "";
	
	/**
	 * �˵�(�û�)ͼƬ
	 */
	private String pic_url = "";
	
	/**
	 * �˵�״̬
	 */
	private String status = "Offline";

	/**
	 * �����˵����
	 * @param id �˵��ʶ(�û���)
	 * @param nick �˵��ǳ�(�û��ǳ�)
	 */
	public WebimEndpoint(String id, String nick)
    {
        this.setId(id);
        this.setNick(nick);
        this.setStatus_time("");
        this.setUrl("");
        this.setPic_url("");
    }

	/**
	 * ��ȡ�˵��ʶ��id��name
	 * @return id �˵��ʶ
	 */
	public String getId() {
		return id;
	}

	
	/**
	 * ���ö˵�
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * ��ȡ�ֳ�
	 * @return �ֳ�״̬
	 */
	public String getShow() {
		return show;
	}

	/**
	 * �����ֳ�
	 * 
	 * @param show
	 */
	public void setShow(String show) {
		this.show = show;
	}

	/**
	 * ��ȡ״̬���ʱ��
	 * @return ״̬���ʱ��
	 */
	public String getStatus_time() {
		return status_time;
	}

	/**
	 * ����״̬���ʱ��
	 * 
	 * @param status_time
	 */
	public void setStatus_time(String status_time) {
		this.status_time = status_time;
	}

	/**
	 * �˵�(�û�)��ҳ
	 * 
	 * @return url �˵�(�û�)��ҳ
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * ���ö˵�(�û�)��ҳ
	 * 
	 * @param url �˵�(�û�)��ҳ
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * �˵�(�û�)ͼƬ
	 * 
	 * @return �˵�(�û�)ͼƬ
	 */
	public String getPic_url() {
		return pic_url;
	}

	/**
	 * ���ö˵�(�û�)ͼƬ
	 * @param pic_url �˵�(�û�)ͼƬ
	 */
	public void setPic_url(String pic_url) {
		this.pic_url = pic_url;
	}

	/**
	 * �˵�(�û�)״̬
	 * @return status �˵�(�û�)״̬
	 */
	public String getStatus() {
		return status;
	}
	

	/**
	 * ���ö˵�(�û�)״̬
	 * @param status �û�״̬
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * �˵�(�û�)�ǳ�
	 * 
	 * @return �˵�(�û�)�ǳ�
	 */
	public String getNick() {
		return nick;
	}

	/**
	 * ���ö˵�(�û�)�ǳ�
	 * 
	 * @param nick �˵�(�û�)�ǳ�
	 */
	public void setNick(String nick) {
		this.nick = nick;
	}

	public String toString() {
		return String.format("Endpoint(id=%s, nick=%s, show=%s", id, nick, show);
	}

}

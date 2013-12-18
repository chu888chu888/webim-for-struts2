/*
 * WebimDao.java
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
package webim.dao;

import java.util.ArrayList;
import java.util.List;

import webim.WebimEndpoint;
import webim.WebimGroup;
import webim.WebimMenu;
import webim.WebimNotification;

/**
 * WebimDao�����ݿ��ж�ȡ���ѹ�ϵ��Ⱥ���ϵ��
 * 
 * @author Ery Lee<ery.lee at gmail.com>
 * @since 1.0
 */
public class WebimDao {
	
	public WebimDao() {
	}
	
	/**
	 * ��ȡ�û��ĺ����б����ݿ��ж�ȡ��Ϣת��ΪWebimEndpoint����
	 * 
	 * @param uid �û�uid
	 * @param limit �б���������
	 * @return �����б�
	 */
	public List<WebimEndpoint> getBuddiesByUid(long uid, int limit) {
		// TODO Auto-generated method stub
		// TODO: ʾ�����룬��Ҫ�滻
		List<WebimEndpoint> buddies = new ArrayList<WebimEndpoint>();
		WebimEndpoint e = new WebimEndpoint("1", "user1");
		e.setPic_url("https://1.gravatar.com/avatar/136e370cbf1cf500cbbf791e56dac614?d=https%3A%2F%2Fidenticons.github.com%2F577292a0aa8cb84aa3e6f06fee6f711c.png&s=50");
		buddies.add(e);
		
		e = new WebimEndpoint("2", "user2");
		e.setPic_url("https://1.gravatar.com/avatar/136e370cbf1cf500cbbf791e56dac614?d=https%3A%2F%2Fidenticons.github.com%2F577292a0aa8cb84aa3e6f06fee6f711c.png&s=50");
		buddies.add(e);
		
		return buddies;
	}


	/**
	 * ���ݺ���id���ݣ���ȡ�����б�
	 * 
	 * @param ids ����id�б�
	 * @return �����б�
	 */
	public List<WebimEndpoint> getBuddiesByIds(long[] ids) {
		// TODO: ʾ�����룬��Ҫ�滻
		return new ArrayList<WebimEndpoint>();
	}

	/**
	 * ��ȡ�û�������Ⱥ�顣
	 * 
	 * @param uid �û�uid
	 * @param limit ������
	 * @return Ⱥ���б�
	 */
	public List<WebimGroup> getGroups(long uid, int limit) {
		// TODO Auto-generated method stub
		// TODO: ʾ�����룬��Ҫ�滻
		List<WebimGroup> groups = new ArrayList<WebimGroup>();
		WebimGroup g = new WebimGroup("group1", "group1");
		g.setPic_url("/Webim/static/images/group.gif");
		groups.add(g);
		return groups;
	}

	
	/**
	 * ��ȡȺ�������Ϣ
	 * 
	 * @param id Ⱥ��id
	 * @return Ⱥ�����
	 */
	public WebimGroup getGroup(String id) {
		// TODO Auto-generated method stub
		// TODO: ʾ�����룬��Ҫ�滻
		return null; //new WebimGroup("1", "group1");
	}

	/**
	 * ��ȡ�û�֪ͨ
	 * @param uid �û�uid
	 * @return �û�֪ͨ�б�
	 */
	public List<WebimNotification> getNotifications(long uid) {
		return new ArrayList<WebimNotification>();
	}

	/**
	 * ��ȡ�û��˵�
	 * 
	 * @param uid �û�uid
	 * 
	 * @return �û��˵��б�
	 */
	public List<WebimMenu> getMenuList(long uid) {
		return new ArrayList<WebimMenu>();
	}

}


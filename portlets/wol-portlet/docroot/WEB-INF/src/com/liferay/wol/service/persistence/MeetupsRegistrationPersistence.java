/**
 * Copyright (c) 2000-2008 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.wol.service.persistence;

/**
 * <a href="MeetupsRegistrationPersistence.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 *
 */
public interface MeetupsRegistrationPersistence {
	public com.liferay.wol.model.MeetupsRegistration create(
		long meetupsRegistrationId);

	public com.liferay.wol.model.MeetupsRegistration remove(
		long meetupsRegistrationId)
		throws com.liferay.portal.SystemException,
			com.liferay.wol.NoSuchMeetupsRegistrationException;

	public com.liferay.wol.model.MeetupsRegistration remove(
		com.liferay.wol.model.MeetupsRegistration meetupsRegistration)
		throws com.liferay.portal.SystemException;

	public com.liferay.wol.model.MeetupsRegistration update(
		com.liferay.wol.model.MeetupsRegistration meetupsRegistration)
		throws com.liferay.portal.SystemException;

	public com.liferay.wol.model.MeetupsRegistration update(
		com.liferay.wol.model.MeetupsRegistration meetupsRegistration,
		boolean merge) throws com.liferay.portal.SystemException;

	public com.liferay.wol.model.MeetupsRegistration updateImpl(
		com.liferay.wol.model.MeetupsRegistration meetupsRegistration,
		boolean merge) throws com.liferay.portal.SystemException;

	public com.liferay.wol.model.MeetupsRegistration findByPrimaryKey(
		long meetupsRegistrationId)
		throws com.liferay.portal.SystemException,
			com.liferay.wol.NoSuchMeetupsRegistrationException;

	public com.liferay.wol.model.MeetupsRegistration fetchByPrimaryKey(
		long meetupsRegistrationId) throws com.liferay.portal.SystemException;

	public java.util.List<com.liferay.wol.model.MeetupsRegistration> findByMeetupsEntryId(
		long meetupsEntryId) throws com.liferay.portal.SystemException;

	public java.util.List<com.liferay.wol.model.MeetupsRegistration> findByMeetupsEntryId(
		long meetupsEntryId, int start, int end)
		throws com.liferay.portal.SystemException;

	public java.util.List<com.liferay.wol.model.MeetupsRegistration> findByMeetupsEntryId(
		long meetupsEntryId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException;

	public com.liferay.wol.model.MeetupsRegistration findByMeetupsEntryId_First(
		long meetupsEntryId,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.wol.NoSuchMeetupsRegistrationException;

	public com.liferay.wol.model.MeetupsRegistration findByMeetupsEntryId_Last(
		long meetupsEntryId,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.wol.NoSuchMeetupsRegistrationException;

	public com.liferay.wol.model.MeetupsRegistration[] findByMeetupsEntryId_PrevAndNext(
		long meetupsRegistrationId, long meetupsEntryId,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.wol.NoSuchMeetupsRegistrationException;

	public java.util.List<com.liferay.wol.model.MeetupsRegistration> findWithDynamicQuery(
		com.liferay.portal.kernel.dao.DynamicQueryInitializer queryInitializer)
		throws com.liferay.portal.SystemException;

	public java.util.List<com.liferay.wol.model.MeetupsRegistration> findWithDynamicQuery(
		com.liferay.portal.kernel.dao.DynamicQueryInitializer queryInitializer,
		int start, int end) throws com.liferay.portal.SystemException;

	public java.util.List<com.liferay.wol.model.MeetupsRegistration> findAll()
		throws com.liferay.portal.SystemException;

	public java.util.List<com.liferay.wol.model.MeetupsRegistration> findAll(
		int start, int end) throws com.liferay.portal.SystemException;

	public java.util.List<com.liferay.wol.model.MeetupsRegistration> findAll(
		int start, int end, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException;

	public void removeByMeetupsEntryId(long meetupsEntryId)
		throws com.liferay.portal.SystemException;

	public void removeAll() throws com.liferay.portal.SystemException;

	public int countByMeetupsEntryId(long meetupsEntryId)
		throws com.liferay.portal.SystemException;

	public int countAll() throws com.liferay.portal.SystemException;
}
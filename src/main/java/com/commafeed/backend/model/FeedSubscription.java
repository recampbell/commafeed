package com.commafeed.backend.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "FEEDSUBSCRIPTIONS")
@SuppressWarnings("serial")
public class FeedSubscription extends AbstractModel {

	@ManyToOne
	@JoinColumn(nullable = false)
	private User user;

	@ManyToOne
	@JoinColumn(nullable = false)
	private Feed feed;

	@Column(length = 128, nullable = false)
	private String title;

	@ManyToOne
	private FeedCategory category;

	@OneToMany(mappedBy = "subscription", cascade = CascadeType.REMOVE)
	private Set<FeedEntryStatus> statuses;

	public Feed getFeed() {
		return feed;
	}

	public void setFeed(Feed feed) {
		this.feed = feed;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public FeedCategory getCategory() {
		return category;
	}

	public void setCategory(FeedCategory category) {
		this.category = category;
	}

	public Set<FeedEntryStatus> getStatuses() {
		return statuses;
	}

	public void setStatuses(Set<FeedEntryStatus> statuses) {
		this.statuses = statuses;
	}

}

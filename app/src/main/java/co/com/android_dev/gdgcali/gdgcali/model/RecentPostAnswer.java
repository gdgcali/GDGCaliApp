package co.com.android_dev.gdgcali.gdgcali.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by user on 25/06/2015.
 */
public class RecentPostAnswer {
    @SerializedName("id")
    private Integer id;

    @SerializedName("type")
    private String type;

    @SerializedName("slug")
    private String slug;

    @SerializedName("url")
    private String url;

    @SerializedName("status")
    private String status;

    @SerializedName("title")
    private String title;

    @SerializedName("title_plain")
    private String title_plain;

    @SerializedName("content")
    private String content;

    @SerializedName("excerpt")
    private String excerpt;

    @SerializedName("date")
    private String date;

    @SerializedName("modified")
    private String modified;

    @SerializedName("categories")
    private ArrayList<CategoriesAnswer> categories;

    @SerializedName("tags")
    private ArrayList<TagsAnswer> tags;

//    @SerializedName("author")
//    private String author;

//    @SerializedName("comments")
//    private String comments;

    @SerializedName("attachments")
    private ArrayList<AttachmentsAnswer> attachments;

    @SerializedName("comment_count")
    private Integer comment_count;

    @SerializedName("comment_status")
    private String comment_status;

    @SerializedName("thumbnail")
    private String thumbnail;

    @SerializedName("thumbnail_size")
    private String thumbnail_size;

    @SerializedName("thumbnail_images")
    private ThumbnailImagesAnswer thumbnail_images;

    public RecentPostAnswer(Integer id, String type, String slug, String url, String status, String title, String title_plain, String content, String excerpt, String date, String modified, ArrayList<CategoriesAnswer> categories, ArrayList<TagsAnswer> tags, ArrayList<AttachmentsAnswer> attachments, Integer comment_count, String comment_status, String thumbnail, String thumbnail_size, ThumbnailImagesAnswer thumbnail_images) {
        this.id = id;
        this.type = type;
        this.slug = slug;
        this.url = url;
        this.status = status;
        this.title = title;
        this.title_plain = title_plain;
        this.content = content;
        this.excerpt = excerpt;
        this.date = date;
        this.modified = modified;
        this.categories = categories;
        this.tags = tags;
        this.attachments = attachments;
        this.comment_count = comment_count;
        this.comment_status = comment_status;
        this.thumbnail = thumbnail;
        this.thumbnail_size = thumbnail_size;
        this.thumbnail_images = thumbnail_images;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle_plain() {
        return title_plain;
    }

    public void setTitle_plain(String title_plain) {
        this.title_plain = title_plain;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getExcerpt() {
        return excerpt;
    }

    public void setExcerpt(String excerpt) {
        this.excerpt = excerpt;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public ArrayList<CategoriesAnswer> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<CategoriesAnswer> categories) {
        this.categories = categories;
    }

    public ArrayList<TagsAnswer> getTags() {
        return tags;
    }

    public void setTags(ArrayList<TagsAnswer> tags) {
        this.tags = tags;
    }

    public ArrayList<AttachmentsAnswer> getAttachments() {
        return attachments;
    }

    public void setAttachments(ArrayList<AttachmentsAnswer> attachments) {
        this.attachments = attachments;
    }

    public Integer getComment_count() {
        return comment_count;
    }

    public void setComment_count(Integer comment_count) {
        this.comment_count = comment_count;
    }

    public String getComment_status() {
        return comment_status;
    }

    public void setComment_status(String comment_status) {
        this.comment_status = comment_status;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getThumbnail_size() {
        return thumbnail_size;
    }

    public void setThumbnail_size(String thumbnail_size) {
        this.thumbnail_size = thumbnail_size;
    }

    public ThumbnailImagesAnswer getThumbnail_images() {
        return thumbnail_images;
    }

    public void setThumbnail_images(ThumbnailImagesAnswer thumbnail_images) {
        this.thumbnail_images = thumbnail_images;
    }
}

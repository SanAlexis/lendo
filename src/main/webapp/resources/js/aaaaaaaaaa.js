var imageUpLoader={
		imageFile:null,
		canvasCtx:document.getElementById("image_canvas").getContext("2d"),
		init:function(){
			//document.getElementById("ras").onclick=this.uploadCanvasAsImage(this);
			document.getElementById("image").onchange=function(event){
				this.imageFile = event.target.files[0];
				var reader = new FileReader();
		        reader.onload = function (event) {
		        	var img= new Image();
		        	img.onload = function(){
		        		this.drowImageOnCanvas(img);
		        		this.displayImage(img);
		        	}
		        	img.src = event.target.result;
		        };

		        reader.readAsDataURL(this.imageFile);
			}
		},
		drowImageOnCanvas: function(img){

			this.canvasCtx.drawImage(img,0,0,100,100,0,0,300,150);
			this.canvasCtx.fillText("Lendo Projet",200,145);
		},
		displayImage:function(img){
			
			document.getElementById("img").src=img.src;
		},
		canvasToBlob: function(canvas,type){
			var byteString = atob(canvas.toDataURL().split(",")[1]),
			ab = new ArrayBuffer(byteString.length),
			la = new Uint8Array(ab),
			i;
			for(i=0; i<byteString.length; i++){
				la[i]=byteString.charCodeAt(i);
			}
			return new Blob([ab], {type:type});
		},
		uploadImage:function(){
			var data = new FormData();
			data.append("file",this.imageFile);
			this.uploadToServer(data);
		},
		uploadCanvasAsImage: function(){
			var data = new FormData();
			var blob = this.canvasToBlob(this.canvasCtx.canvas, this.imageFile.type);
			data.append("blob",blob);
			data.append("blobName",this.imageFile.name);
			data.append("blobType",this.imageFile.type);
			this.uploadToServer(data);
		},
		uploadToServer: function(formData){
			$
			.ajax({
				type : "post",
				url : "",
				cache : false,
				data : 'data=' + formData,
				success : function(response) {
				},
				error : function() {
					alert('Error while request..');
				}
			});
			
		}
		
};

//bonnnnnnnnnnnnnnnnnnnnnnnnnnn


var imageUpLoader={
		imageFile:null,
		canvasCtx:document.getElementById("image_canvas").getContext("2d"),
		init:function(){
			//document.getElementById("ras").onclick=function(event){this.uploadCanvasAsImage();}
			document.getElementById("image").onchange=function(event){
				this.imageFile = event.target.files[0];
				var reader = new FileReader();
		        reader.onload = function (event) {
		        	var img= new Image();
		        	img.onload = function(){
		        		document.getElementById("img").src=img.src;
		        		$( "#infos" ).modal();
		        		this.drowImageOnCanvas(img);
		        		//this.displayImage(img);
		        	}
		        	img.src = event.target.result;
		        };

		        reader.readAsDataURL(this.imageFile);
			}
		},
		drowImageOnCanvas: function(img){

			this.canvasCtx.drawImage(img,0,0,100,100,0,0,300,150);
			this.canvasCtx.fillText("Lendo Projet",200,145);
		},
		displayImage:function(img){
			
			document.getElementById("img").src=img.src;
		},
		canvasToBlob: function(canvas,type){
			var byteString = atob(canvas.toDataURL().split(",")[1]),
			ab = new ArrayBuffer(byteString.length),
			la = new Uint8Array(ab),
			i;
			for(i=0; i<byteString.length; i++){
				la[i]=byteString.charCodeAt(i);
			}
			return new Blob([ab], {type:type});
		},
		uploadImage:function(){
			var data = new FormData();
			data.append("file",this.imageFile);
			this.uploadToServer(data);
		},
		uploadCanvasAsImage: function(event){
			var data = new FormData();
			var blob = this.canvasToBlob(this.canvasCtx.canvas, this.imageFile.type);
			data.append("blob",blob);
			data.append("blobName",this.imageFile.name);
			data.append("blobType",this.imageFile.type);
			this.uploadToServer(data);
		},
		uploadToServer: function(formData){
			$
			.ajax({
				type : "post",
				url : "",
				cache : false,
				data : 'data=' + formData,
				success : function(response) {
				},
				error : function() {
					alert('Error while request..');
				}
			});
			
		}
		
};



/*
 * canvas to blob
*/
function canvas(){
	var canvas=document.createElement('canvas');
    var ctx=canvas.getContext("2d");
        var reader = new FileReader();
        reader.onload = function (e) {
        	var img= new Image();
        	img.onload = function(){
        		ctx.drawImage(img,$('#resize').position().left-15,$('#resize').position().top-15,$('#resize').width(),$('#resize').height(),0,0,300,150);
        		ctx.fillText("Lendo Projet",200,145);alert();
        	}
        	img.src=e.target.result;
        };

        reader.readAsDataURL(input.files[0]);
        return ctx;
	
}
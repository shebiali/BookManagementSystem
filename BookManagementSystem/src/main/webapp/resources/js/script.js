$(document).ready(
		function() {

			$('#registration-form').validate(
					{
						rules : {
							bookTitlePrm : {
								required : true
							},

							totalPages : {
								required : true
							},

							isbn : {
								required : true,
								minlength : 13
							},
							datepicker : {
								required : true,
								date : true
							},
							categoryId : {
								required : true,

							},

							publisherId : {
								required : true,

							},

						},
						highlight : function(element) {
							$(element).closest('.control-group').removeClass(
									'success').addClass('error');
						},
						success : function(element) {
							element.text('OK!').addClass('valid').closest(
									'.control-group').removeClass('error')
									.addClass('success');
						}
					});

		}); // end document.ready

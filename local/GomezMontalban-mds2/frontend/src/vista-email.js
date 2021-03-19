import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@polymer/iron-icon/iron-icon.js';

class VistaEmail extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-horizontal-layout theme="spacing" style="align-items: center; justify-content: space-between; border:1px solid black;">
 <vaadin-horizontal-layout theme="spacing">
  <p>Asunto:</p>
  <p>Paragraph</p>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing">
  <p>Fecha: </p>
  <p>Paragraph</p>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing">
  <p>Asunto:</p>
  <p>Paragraph</p>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: center; width: 20%;">
  <iron-icon style="flex-grow: 0; align-self: center;"></iron-icon>
  <iron-icon></iron-icon>
 </vaadin-horizontal-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-email';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaEmail.is, VistaEmail);

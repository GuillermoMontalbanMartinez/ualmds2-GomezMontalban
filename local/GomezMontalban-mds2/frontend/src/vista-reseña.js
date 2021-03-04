import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaReseña extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-horizontal-layout class="content" style="height: 100%; width: 100%; border: #ccc solid 2px; border-radius : 20px; justify-content: center; background : #efefef;" theme="spacing">
 <vaadin-horizontal-layout theme="spacing" style="align-self: center; flex-shrink: 0; height: 80%; justify-content: center; width: 20%; align-items: center; margin-left: var(--lumo-space-xl);">
  <img style="width: 100%; height: 100%;">
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" style="height: 80%; justify-content: space-between; width: 100%; align-self: center;">
  <vaadin-vertical-layout theme="spacing" style="height: 10%; width: 100%; align-items: stretch; justify-content: center;">
   <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; flex-wrap: wrap; justify-content: space-between; flex-grow: 0; width: 80%; align-self: center;">
    <vaadin-horizontal-layout theme="spacing" style="flex-grow: 0; justify-content: flex-start; flex-shrink: 0;">
     <p style="flex-grow: 0; flex-shrink: 1;">Paragraph</p>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; flex-shrink: 0; margin-left: var(--lumo-space-xl); justify-content: flex-end;">
     <p id="flex-grow: 0; flex-shrink: 0;">Paragraph</p>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-self: stretch; flex-grow: 1; flex-shrink: 0; flex-direction: column; justify-content: center; align-items: center; margin-right: var(--lumo-space-xl);">
   <p style="margin-top: var(--lumo-space-xl); width: 90%; height: 90%; background : white;">Paragraph</p>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-reseña';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaReseña.is, VistaReseña);

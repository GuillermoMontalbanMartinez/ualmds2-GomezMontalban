import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

class VistaProductoSeleccionado extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-horizontal-layout theme="spacing" style="height: 100%; width: 100%; border: #ccc solid 2px; border-radius : 20px; background : #efefef; padding-right: var(--lumo-space-m); margin-bottom: var(--lumo-space-m); justify-content: flex-end;">
 <vaadin-horizontal-layout theme="spacing" style="align-self: center; flex-shrink: 0; justify-content: center; align-items: center; margin-left: var(--lumo-space-xl); width: 15%; height: 60%;">
  <img style="height: 100%; width: 100%;">
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" style="height: 80%; justify-content: space-between; width: 100%; align-self: center;">
  <vaadin-vertical-layout theme="spacing" style="height: 10%; width: 100%; align-items: stretch; justify-content: center;">
   <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; flex-wrap: wrap; justify-content: flex-start; flex-grow: 0; width: 95%; align-self: center;">
    <vaadin-horizontal-layout theme="spacing" style="flex-grow: 0; flex-shrink: 0; margin-left: var(--lumo-space-xl); justify-content: flex-start;">
     <p style="flex-grow: 0; flex-shrink: 0;">Paragraph</p>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-self: stretch; flex-grow: 1; flex-shrink: 0; flex-direction: column; justify-content: center; align-items: center; margin-right: var(--lumo-space-xl); height: 65%;">
   <p style="margin-top: var(--lumo-space-xl); width: 90%; height: 100%; background : white; border : 1px solid black;">Paragraph</p>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 0; align-items: stretch; padding-right: var(--lumo-space-xl); width: 100%;">
   <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; flex-grow: 0; justify-content: space-around; margin-bottom: var(--lumo-space-xl); padding-bottom: var(--lumo-space-xl);">
    <vaadin-horizontal-layout theme="spacing" style="flex-grow: 0; flex-shrink: 0; width: 53%; margin-bottom: var(--lumo-space-xl); align-self: center; height: 10%;">
     <p style="flex-grow: 0; align-self: center; margin-left: var(--lumo-space-xl);">Paragraph</p>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="flex-grow: 0; flex-shrink: 0; margin-bottom: var(--lumo-space-xl); align-self: center; height: 10%;">
     <p style="flex-grow: 0; align-self: center;">Paragraph</p>
    </vaadin-horizontal-layout>
    <vaadin-button theme="icon" aria-label="Add new" style="align-self: flex-start;">
     <iron-icon icon="lumo:plus"></iron-icon>
    </vaadin-button>
    <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton" style="align-self: flex-start;">
     <iron-icon icon="lumo:minus"></iron-icon>
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 5%; height: 15%; align-self: center; margin-bottom: var(--lumo-space-s); padding-right: var(--lumo-space-m);">
  <vaadin-button theme="icon" aria-label="Add new">
   <iron-icon icon="lumo:cross"></iron-icon>
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-producto-seleccionado';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductoSeleccionado.is, VistaProductoSeleccionado);

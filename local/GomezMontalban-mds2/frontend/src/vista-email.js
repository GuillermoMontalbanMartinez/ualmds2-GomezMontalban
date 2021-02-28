import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-email`
 *
 * VistaEmail element.
 *
 * @customElement
 * @polymer
 */
class VistaEmail extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
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

import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-reseņa`
 *
 * VistaReseņa element.
 *
 * @customElement
 * @polymer
 */
class VistaReseņa extends PolymerElement {

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
        return 'vista-reseņa';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaReseņa.is, VistaReseņa);
